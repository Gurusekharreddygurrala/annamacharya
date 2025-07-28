import json
import random
import nltk
from nltk.stem import PorterStemmer

nltk.download('punkt')

# Load the intents file
with open("intents.json") as file:
    data = json.load(file)

# Create stemmer to process words
stemmer = PorterStemmer()

# Simple function to stem user input
def stem_words(sentence):
       words = sentence.lower().split()
       return [stemmer.stem(w.lower()) for w in words]

# Function to get chatbot response
def get_response(user_input):
    user_words = stem_words(user_input)

    for intent in data["intents"]:
        for pattern in intent["patterns"]:
            pattern_words = stem_words(pattern)
            if set(user_words) & set(pattern_words):  # Match common words
                return random.choice(intent["responses"])
    
    return "Sorry, I didn't understand that. Please try again."

# Test loop (you can type to chatbot here)
while True:
    message = input("You: ")
    if message.lower() in ["exit", "quit"]:
        print("Bot: Goodbye!")
        break
    reply = get_response(message)
    print("Bot:", reply)
