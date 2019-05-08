n=int(input("Dimension du tableau : "))
T=[]
for i in range(n):
    T.append(float(input()))
n=len(T)
tri=True
compteur=0
while (tri==True):
    tri=False
    for i in range (n-1,0,-1):
        if T[i-1]>T[i]:
            tri=True
            aux=T[i]
            T[i]=T[i-1]
            T[i-1]=aux
            print(T)
            compteur=compteur+1
print("Fin de l'algorithme : ",T)
print("Le programme a effectué ",compteur,"comparaisons.")
