#Application 7
###1
from random import*
points=10
S=0
for i in range (1,10):
    de=randint(1,6)
    print("Lancer de dé",i,":",de)
    S=S+de

if S%2==0:
     points=points+1
     print("Vous avez gagné 1 point.")
else:
     points=points-2
     print("Vous avez perdu 2 points.")
print ("Votre somme de lancers est de ",S)
print("Votre score est de ",points,"points.")

###2
print("=========================================================")
from random import*
points=10
S=0
for j in range (1,5):
    print("=== Partie numéro",j,"===")
    for i in range (1,10):
        de=randint(1,6)
        print("Lancer de dé",i,":",de)
        S=S+de
    print("Votre somme de lancers est de",S,".")
    if S%2==0:
        points=points+1
        print("Vous avez gagné 1 point.")
    else:
        points=points-2
        print("Vous avez perdu 2 points.")
print("Votre score est de ",points,"points.")



###3
print("=========================================================")
from random import*
points=10
S=0
n=0
while points>0:
    n=n+1
    print("=== Partie numéro",n,"===")
    for i in range (1,10):
       de=randint(1,6)
       print("Lancer de dé",i,":",de)
       S=S+de
    if S%2==0:
        points=points+1
        print("Vous avez gagné 1 point.")
    else:
        points=points-2
        print("Vous avez perdu 2 points.")
        
print("Quel dommage, vous êtes arrivé à 0 point, fin de la partie !")






























