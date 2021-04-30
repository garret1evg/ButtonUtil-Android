package ua.eugen.custombuttonutil

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton


const val LOG_TAG = "on_click"

class Button2(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    AppCompatButton(context, attrs, defStyleAttr){
    init {
        text = "customButton"
    }
}