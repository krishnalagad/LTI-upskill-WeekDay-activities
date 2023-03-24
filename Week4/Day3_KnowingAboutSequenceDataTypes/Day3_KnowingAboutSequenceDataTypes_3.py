if __name__ == "__main__":
    word = input("Enter the word: ").lower()

    vowels = 'aeiou'

    count = 0
    for letter in word:
        if letter in vowels:
            count += 1

    print(f"Count of vowels in {word} is {count}")
