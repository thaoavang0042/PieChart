package vangthao.app.piechart

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.eazegraph.lib.models.PieModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setData()
    }

    private fun setData() {
        txtR?.text = "40"
        txtPython?.text = "30"
        txtCPP?.text = "5"
        txtJava?.text = "25"

        pieChart?.addPieSlice(
            PieModel(
                "Pythong",
                Integer.parseInt(txtR?.text.toString()).toFloat(),
                Color.parseColor("#FFA726")
            )
        )
        pieChart?.addPieSlice(
            PieModel(
                "R",
                Integer.parseInt(txtPython?.text.toString()).toFloat(),
                Color.parseColor("#66BB6A")
            )
        )
        pieChart?.addPieSlice(
            PieModel(
                "CPP",
                Integer.parseInt(txtCPP?.text.toString()).toFloat(),
                Color.parseColor("#EF5350")
            )
        )
        pieChart?.addPieSlice(
            PieModel(
                "Java",
                Integer.parseInt(txtJava?.text.toString()).toFloat(),
                Color.parseColor("#29B6F6")
            )
        )

        pieChart?.startAnimation()
    }
}