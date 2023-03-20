if __name__ == "__main__":
    N = int(input())
    print("Enter x and y indicates  x/y of an hour")
    x = int(input())
    y = int(input())

    # Calculate the total number of seconds in x/y of an hour
    total_seconds = (x * 60 * 60 // y)

    # Calculate the count of light flashes
    count = total_seconds // N

    # Print the output in the required format
    print("The light will flash {} times.".format(count+1))
