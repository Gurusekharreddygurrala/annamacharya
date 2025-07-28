import nltk
from nltk.stem.porter import PorterStemmer
import tkinter as tk

stemmer = PorterStemmer()

# Questions and answers
questions_answers = {
    "hi": "Hello! How can I assist you?",
    "hello": "Hi there! Ask me anything about college.",
    "what is your name": "I'm your college assistant chatbot.",
    "bye": "See you soon!",
    "course available": "Courses available are CSE, ECE, EEE, MECH, and CIVIL.",
    "fee details": "The annual fee for BTech programs is ₹95,000.",
    "hostel facility": "Yes, we provide hostel facility for both boys and girls.",
    "placement details": "Top recruiters include Infosys, TCS, and Wipro. 80%+ placement rate.",
    "location": "We are located in Andhra Pradesh, India.",
    "college timing": "College timing is 9 AM to 4:30 PM."
}

# Simple stem + match
def stem_words(sentence):
    words = sentence.lower().split()
    return [stemmer.stem(w) for w in words]

def get_response(user_input):
    user_words = stem_words(user_input)
    for question in questions_answers:
        if stemmer.stem(question) in user_words:
            return questions_answers[question]
    return "Sorry, I didn't understand that. Please ask something else."

# GUI code
def send_message():
    user_input = entry.get()
    chat_log.insert(tk.END, "You: " + user_input + "\n")
    reply = get_response(user_input)
    chat_log.insert(tk.END, "Bot: " + reply + "\n\n")
    entry.delete(0, tk.END)

# Create GUI window
root = tk.Tk()
root.title("College Chatbot")

chat_log = tk.Text(root, height=20, width=50, bg="lightyellow")
chat_log.pack(padx=10, pady=10)

entry = tk.Entry(root, width=40)
entry.pack(side=tk.LEFT, padx=10)

send_button = tk.Button(root, text="Send", command=send_message)
send_button.pack(side=tk.LEFT)

root.mainloop()
