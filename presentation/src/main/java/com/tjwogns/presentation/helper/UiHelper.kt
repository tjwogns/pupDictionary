package com.tjwogns.presentation.helper

import android.animation.Animator
import android.animation.AnimatorInflater
import android.content.Context
import android.view.View
import com.tjwogns.presentation.R

/**
 * Ui Helper
 */
object UiHelper {
    fun flipView(
        context: Context?,
        view: View?
    ): Animator {
        val flipAnimation =
            AnimatorInflater.loadAnimator(context,
                R.animator.card_flip_left_in
            )
        flipAnimation.setTarget(view)
        return flipAnimation
    }
}