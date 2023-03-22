if __name__ == "__main__":
    n = int(input())
    n1 = int(input())
    n2 = int(input())
    n3 = int(input())

    dist1 = abs(n - n1)
    dist2 = abs(n - n2)
    dist3 = abs(n - n3)

    min_dist = min(dist1, dist2, dist3)

    if min_dist == dist1:
        closest_floor = n1
    elif min_dist == dist2:
        closest_floor = n2
    else:
        closest_floor = n3

    if min_dist == dist1 and n1 > closest_floor:
        closest_floor = n1
    if min_dist == dist2 and n2 > closest_floor:
        closest_floor = n2
    if min_dist == dist3 and n3 > closest_floor:
        closest_floor = n3

    print(closest_floor)
