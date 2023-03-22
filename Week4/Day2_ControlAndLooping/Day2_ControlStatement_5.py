width = int(input())
length = int(input())

total_area = width * length
tile_area = 8 * 8

whole_tiles = total_area // tile_area
part_tiles = 1 if total_area % tile_area > 0 else 0

print(whole_tiles, part_tiles)
