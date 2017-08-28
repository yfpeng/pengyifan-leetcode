"""
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output "Fizz" instead of the number and for the multiples of five output "Buzz".
For numbers which are multiples of both three and five output "FizzBuzz".
"""


def fizz_buzz(n):
    """
    :type n: int
    :rtype: List[str]
    """
    output = []
    for i in range(1, n+1):
        if i % 15 == 0:
            output.append('FizzBuzz')
        elif i % 3 == 0:
            output.append('Fizz')
        elif i % 5 == 0:
            output.append('Buzz')
        else:
            output.append(str(i))
    return output


def test_fizz_buzz():
    expected = [
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
    ]
    assert fizz_buzz(15) == expected

if __name__ == '__main__':
    test_fizz_buzz()