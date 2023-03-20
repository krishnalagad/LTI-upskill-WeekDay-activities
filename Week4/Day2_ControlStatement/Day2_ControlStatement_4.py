def find_parking_location(N1, N2, N3, N4, N):
    total_capacity = N1 + N2 + N3 + N4
    if N <= total_capacity:
        if N < N1:
            return "B1"
        elif N < N1 + N2:
            return "B2"
        elif N < N1 + N2 + N3:
            return "B3"
        else:
            return "B4"
    else:
        return "EXT"
    
    
if __name__ == "__main__":
    n = int(input())
    n1 = int(input())
    n2 = int(input())
    n3 = int(input())
    n4 = int(input())

    location = find_parking_location(n1, n2, n3, n4, n)
    print(location)