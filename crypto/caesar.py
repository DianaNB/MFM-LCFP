from helpers import alphabet_position, rotate_character

def encrypt(text,rot):
    message = ''
    for char in text:
        message += rotate_character(char,rot)
    return message

def main():
    yourmessage = input("Please enter your message:")
    message = encrypt(yourmessage,13)
    print(message)

if __name__ == "__main__":
    main()
