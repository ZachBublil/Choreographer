package zachinio.sample.choreographer.ui

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import zachinio.choreograper.Choreographer
import zachinio.choreograper.animation.*
import zachinio.sample.choreographer.R


class SampleActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Choreographer.get()
            .addAnimation(EnterAnimation(helloWorld, EnterAnimation.Direction.TOP, 560))
            .addAnimation(ScaleAnimation(childView, ScaleAnimation.Direction.DOWN, 560))
            .addAnimation(BounceAnimation(childView2,50))
            .animate()
    }
}