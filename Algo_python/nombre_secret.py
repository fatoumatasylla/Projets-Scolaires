#TP2
##Algorithme A3

from random import*
nombresecret=randint(1,10000)
Compteur=0
proposition=0
E=0
while Compteur!=15:
    for proposition != nombresecret :
        proposition=int(input("Veuillez saisir un nombre entre 1 et 10000 : "))
        E=E+1
        if proposition>nombresecret:
            print("Le nombre secret est plus petit.")
        if proposition<nombresecret:
            print("Le nombre secret est plus grand.")
        if proposition==nombresecret:
            print("Bravo ! Vous avez trouvé le nombre secret !")
        Compteur=Compteur+1
if E==15:
        print("Dommage, vous n'avez pas réussi à trouver le nombre secret !")
