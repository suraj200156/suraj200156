from order import order
from sell import sell
from stocks import laptops


def main():
    print("Your Message")
    while True:
        print("1.display laptop, 2.sell, 3.order, 4.exit")
        try:
            X = int(input("enter any number from 1 to 4: "))
            if (X == 1):
               laptops()

            elif (X == 2):
                order()
                break

            elif (X == 3):
                sell()
                break

            elif (X == 4):
                print("Exit")
                break
            else:
                print("select 1 to 4")

        except ValueError:
            print("select int")


if __name__ == '__main__':
    main()
