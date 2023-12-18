import random
def main():
    #debug turn on to true to see debug messages
    debug = True
    # create a random number from 0 - 10
    random_number = random.randint(0, 10)
    if debug:
        print("check random number: " + str(random_number))
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
            # check if guess is out of range
            if guess < 0:
                print("Your guess is too low please guess a number greater than 0")
            # tell the user their guess is too low
            else:
                print("Your guess is too low")
        # check if the user's guess is too high
        elif guess > random_number:
            # check if guess is out of range
            if guess > 10:
                print("Your guess is too high please guess a number less than 10")
            # tell the user their guess is too high
            else:
                print("Your guess is too high")
        # if the user guess correct
        elif guess == random_number:
            print("You guessed the number!")
            # tell the user how many guesses it took them
            print("It took you " + str(number_of_guesses) + " guesses")
            guess_correct = True
main()