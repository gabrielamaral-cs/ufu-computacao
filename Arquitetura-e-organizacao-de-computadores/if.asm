.data
    beq$s0,$s1,else
    add $s2,$s3,$s4
    j fim
    else:
        sub $s2,$s3,$s4
    fim:
    addi $s2,$s2,1