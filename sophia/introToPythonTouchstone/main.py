import random
def main():
    # create a random number from 0 - 10
    random_number = random.randint(0, 10)
    # create a variable to store the user's guess
    guess_correct = False
    # create a variable to store the number of guesses
    number_of_guesses = 0
    # create a while loop to check if the user's guess is correct
    while not guess_correct:
        # ask the user for their guess
        guess = int(input("Guess a number between 0 and 10: "))
        # add one to the number of guesses
        number_of_guesses += 1
        # check if the user's guess is too low
        if guess < random_number:
            # tell the user their guess is too low
            print("Your guess is too low")
        # check if the user's guess is too high
        elif guess > random_number:
            # tell the user their guess is too high
            print("Your guess is too high")
        elif guess == random_number:
            print("You guessed the number!")
            print("It took you " + str(number_of_guesses) + " guesses")
            guess_correct = True

main()