if __name__ == "__main__":
    width = int(input())
    length = int(input())
    width_feet = width / 12
    length_feet = length / 12
    total_area = width_feet * length_feet
    tiles_needed = int(total_area // 0.44)
    partial_area = total_area % 0.44
    if partial_area > 0:
        if partial_area <= 0.22:
            partial_tiles_needed = 1
        else:
            partial_tiles_needed = 2
    else:
        partial_tiles_needed = 0
    print(tiles_needed)
    print(partial_tiles_needed)

