;SERIES 1+3+5+....+10(TIMES)
	MVI A,00H
	MVI B,01H
	MVI C,0AH
LOOP:   ADD B
	INR B
	INR B
	DCR C
	JNZ LOOP

	HLT
