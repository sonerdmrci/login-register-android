package com.login.loginapp.components

import android.content.Context
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import com.login.loginapp.R

class CustomTextField @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatEditText(context, attrs, defStyleAttr) {

    enum class CustomTextFieldType {
        USERNAME, EMAIL, PASSWORD
    }

    private var fieldType: CustomTextFieldType = CustomTextFieldType.USERNAME

    init {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.CustomTextField)
            val type = typedArray.getInt(R.styleable.CustomTextField_fieldType, 0)
            fieldType = CustomTextFieldType.values()[type]
            typedArray.recycle()
        }

        configureTextField()
    }

    private fun configureTextField() {
        when (fieldType) {
            CustomTextFieldType.USERNAME -> {
                hint = "Kullanıcı adı giriniz"
            }
            CustomTextFieldType.EMAIL -> {
                hint = "Mail adresi giriniz"
                inputType = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            }
            CustomTextFieldType.PASSWORD -> {
                hint = "Şifre giriniz"
                inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
                transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
    }

    fun setFieldType(type: CustomTextFieldType) {
        fieldType = type
        configureTextField()
    }
}
