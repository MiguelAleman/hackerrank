from collections import defaultdict


def minion_game_v1(string):
    """
    V1 Implementation.
    Too slow.
    """
    vowels = set('AEIOU')

    # vowels
    player1 = defaultdict(lambda: 0)

    # consonants
    player2 = defaultdict(lambda: 0)

    for i in range(0, len(string)):
        player = player1 if string[i] in vowels else player2
        for j in range(i, len(string)):
            substring = f'{string[i:j + 1]}'
            player[substring] = player[substring] + 1

    player1_score = sum(player1.values())
    player2_score = sum(player2.values())

    if player1_score > player2_score:
        print(f'Kevin {player1_score}')
    elif player2_score > player1_score:
        print(f'Stuart {player2_score}')
    else:
        print('Draw')


def minion_game_v2(string):
    """
    V2 implementation.
    """
    vowels = set('AEIOU')
    kevin, stuart = 0, 0
    for i in range(len(string)):
        if string[i] in vowels:
            kevin += len(string) - i
        else:
            stuart += len(string) - i

    if kevin > stuart:
        print(f'Kevin {kevin}')
    elif stuart > kevin:
        print(f'Stuart {stuart}')
    else:
        print('Draw')


if __name__ == '__main__':
    s = input()
    minion_game_v2(s)
