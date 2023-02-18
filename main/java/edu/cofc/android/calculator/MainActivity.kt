package edu.cofc.android.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.cofc.android.calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val calcEngine = CalculatorEngine()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.num0Button.setOnClickListener {
            calcEngine.insert('0')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.num1Button.setOnClickListener {
            calcEngine.insert('1')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.num2Button.setOnClickListener {
            calcEngine.insert('2')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.num3Button.setOnClickListener {
            calcEngine.insert('3')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.num4Button.setOnClickListener {
            calcEngine.insert('4')
            binding.displayArea.text = calcEngine.getDisplay()

        }

        binding.num5Button.setOnClickListener {
            calcEngine.insert('5')
            binding.displayArea.text = calcEngine.getDisplay()

        }

        binding.num6Button.setOnClickListener {
            calcEngine.insert('6')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.num7Button.setOnClickListener {
            calcEngine.insert('7')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.num8Button.setOnClickListener {
            calcEngine.insert('8')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.num9Button.setOnClickListener {
            calcEngine.insert('9')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.ceButton.setOnClickListener {
            calcEngine.clearEntry()
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.clearButton.setOnClickListener {
            calcEngine.clear()
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.minusButton.setOnClickListener {
            calcEngine.perform(Operation.SUBTRACT)
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.divisionButton.setOnClickListener {
            calcEngine.perform(Operation.DIVIDE)
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.plusButton.setOnClickListener {
            calcEngine.perform(Operation.ADD)
            binding.displayArea.text = calcEngine.getDisplay()

        }

        binding.multiButton.setOnClickListener {
            calcEngine.perform(Operation.MULTIPLY)
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.dotButton.setOnClickListener {
            calcEngine.insert('.')
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.equalsButton.setOnClickListener {
            calcEngine.perform(Operation.EQUALS)
            binding.displayArea.text = calcEngine.getDisplay()
        }

        binding.plusButtonMinus.setOnClickListener {
            calcEngine.toggleSign()
            binding.displayArea.text = calcEngine.getDisplay()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putAll(calcEngine.getState())
        binding.displayArea.text = calcEngine.getDisplay()
    }

    override fun onRestoreInstanceState(inState : Bundle) {
        super.onRestoreInstanceState(inState)
        calcEngine.setState(inState)
        binding.displayArea.text = calcEngine.getDisplay()
    }
}