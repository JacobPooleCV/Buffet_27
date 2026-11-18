import requests
choice = input("What pokemon ")

a = "https://pokeapi.co/api/v2/pokemon/" + choice
pokemon = requests.get(a).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print(pokemon["types"][0]["type"]["name"])

