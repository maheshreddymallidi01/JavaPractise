package com.practise.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class CalculationMethod {

	public List<Integer> doubleTheNumber(List<Integer> inputNumbers, Operands operands){
		List<Integer> outputNumbers = new ArrayList<>();
		inputNumbers.forEach(inputNumber->outputNumbers.add(operands.doubleTheValue(inputNumber)));
		return outputNumbers;
	}
}
