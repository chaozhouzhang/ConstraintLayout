package androidstack.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


/**
 * ConstraintLayout 无嵌套视图组，使用扁平视图层次结构创建复杂的大型布局，所有的视图均根据同级视图与父布局之间的关系进行布局。
 * 要在 ConstraintLayout 中定义某个视图的位置，必须为该视图添加至少一个水平约束条件和一个垂直约束条件，但通常情况下会需要更多约束条件。
 * 每个约束条件均表示与其他视图、父布局或隐形引导线之间连接或对齐方式，每个约束条件均定义了视图在竖轴或者横轴上的位置。
 *
 * 可以添加垂直或水平的引导线来约束视图，并且应用用户看不到该引导线。可以根据相对于布局边缘的 dp 单位或百分比在布局中定位引导线。
 *
 * 与引导线类似，屏障是一条隐藏的线，可以用它来约束视图。屏障不会定义自己的位置；相反，屏障的位置会随着其中所含视图的位置而移动。如果希望将视图限制到一组视图而不是某个特定视图，这就非常有用。
 *
 * 屏障线 Barrier 生成方式与 Guideline 不一样 , Guideline 是指定好位置 , Barrier 是通过多个组件生成的位置 ;
 *
 *
 * 添加约束：
 * 父级位置、顺序位置、对齐方式、基线对齐、引导线约束、屏障约束
 * layout_constraintTop_toTopOf
 * layout_constraintTop_toBottomOf
 *
 * layout_constraintBottom_toBottomOf
 * layout_constraintBottom_toTopOf
 *
 * layout_constraintStart_toStartOf
 * layout_constraintStart_toEndOf
 *
 * layout_constraintEnd_toEndOf
 * layout_constraintEnd_toStartOf
 *
 * layout_constraintLeft_toLeftOf
 * layout_constraintLeft_toRightOf
 *
 * layout_constraintRight_toRightOf
 * layout_constraintRight_toLeftOf
 *
 * layout_constraintBaseline_toBaselineOf
 *
 * androidx.constraintlayout.widget.Guideline
 * orientation
 * layout_constraintGuide_begin
 * layout_constraintGuide_end
 * layout_constraintGuide_percent
 *
 * androidx.constraintlayout.widget.Barrier
 * barrierDirection
 * constraint_referenced_ids
 *
 *
 *
 * 调整约束偏差：
 * layout_constraintHorizontal_bias
 * layout_constraintVertical_bias
 *
 *
 * 调整视图尺寸：
 *
 * MATH_CONSTRAINT
 * app:layout_constraintWidth_default
 * spread
 * wrap
 * percent
 * app:layout_constraintHeight_default
 * layout_constraintWidth_min
 * layout_constraintHeight_min
 * layout_constraintWidth_max
 * layout_constraintHeight_max
 * layout_constraintWidth_percent
 * layout_constraintHeight_percent
 *
 *
 * layout_constraintDimensionRatio
 * h,1:2
 * W,1:2
 *
 *
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun baseline(view: View) {

    }
    fun guideline(view: View) {}
    fun barrier(view: View) {}
}
