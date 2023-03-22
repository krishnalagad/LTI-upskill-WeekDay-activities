if __name__ == "__main__":
    students = int(input("Number of students:\n"))
    teams = int(input("Number of teams:\n"))

    std_in_team = students // teams
    std_left = students % teams

    print("The number of students in each team, left out is (" + str(std_in_team) + ", " + str(std_left) + ")")
