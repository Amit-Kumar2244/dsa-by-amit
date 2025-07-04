def print_natural_numbers(n):
    if n <= 0:
        return
    
    print(n, end=" ")
    print_natural_numbers(n - 1)

n = int(input("Enter value of n: "))
print(f"First {n} natural numbers: ", end="")
print_natural_numbers(n)
print()