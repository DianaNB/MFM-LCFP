from helpers import alphabet_position, rotate_character

def encrypt(text, keyword):
    message = ''
    index = 0
    for char in text:
        if char.isalpha():
            rot = alphabet_position(keyword[index % len(keyword)])
            index +=1
            message += rotate_character(char,rot)
        else:
            message += char
    return message

def main():
    secret_message = input("Please enter in a message:")
    keyword = input("Please enter in your code word:")
    message = encrypt(secret_message, keyword)
    print("Your coded message is:", message)

if __name__ == "__main__":
    main()
