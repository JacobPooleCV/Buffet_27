import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
#joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself


# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke



num = int(input("how many jokes would you like?"))
type = input("What type of joke woudl you like? (single/double)")

if type == "single":
    for i in range(0,num):
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
    print(joke["joke"])
    print()
elif type == "double":
    for i in range(0, num):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        print(joke["setup"])
        print(joke["delivery"])
        print()
else:
    print("You didnt say single or doubleA")