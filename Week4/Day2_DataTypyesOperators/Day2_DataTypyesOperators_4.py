def generate_multiplication_table(num, start, end):
    for i in range(start, end+1):
        print(num, "*", i, "=", num*i)

if __name__ == "__main__":
    num = int(input())
    start = int(input())
    end = int(input())
    generate_multiplication_table(num, start, end)
