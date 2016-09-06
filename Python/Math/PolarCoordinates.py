import cmath
num = complex(input())
print(abs(complex(num.real, num.imag)))
print(cmath.phase(complex(num.real, num.imag)))
