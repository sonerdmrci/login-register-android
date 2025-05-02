package com.login.loginapp.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.appcompat.content.res.AppCompatResources
import com.login.loginapp.R

class AuthHeaderView @JvmOverloads constructor(
    context: Context,
    @Nullable attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val logoImageView: ImageView
    private val titleLabel: TextView
    private val subTitleLabel: TextView

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.auth_header_view, this, true)

        logoImageView = findViewById(R.id.logoImageView)
        titleLabel = findViewById(R.id.titleLabel)
        subTitleLabel = findViewById(R.id.subTitleLabel)
    }

    fun setData(title: String, subTitle: String, imageNamed: String) {
        titleLabel.text = title
        subTitleLabel.text = subTitle
        logoImageView.setImageDrawable(AppCompatResources.getDrawable(context, context.resources.getIdentifier(imageNamed, "drawable", context.packageName)))
    }
}
