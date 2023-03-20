def Power(a, b, n):
    if a < 0 or b < 0 or n < 0:
        print("Invalid Input")
        return
    for i in range(n):
        print(f"{a+i}**{b}={pow(a+i, b)}")

if __name__ == "__main__":
    a = int(input("Enter the value of a\n"))
    b = int(input("Enter the value of b\n"))
    n = int(input("Enter the value of n\n"))
    
    Power(a, b, n)