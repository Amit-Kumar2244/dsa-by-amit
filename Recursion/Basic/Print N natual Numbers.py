def print_natural_numbers(n):
    if n <= 0:
        return
    print_natural_numbers(n - 1)
    print(n, end=" ")

n = int(input("Enter value of n: "))
print(f"First {n} natural numbers: ", end="")
print_natural_numbers(n)
print()