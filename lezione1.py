# definizione della classe
class Studente:
    def __init__(self, nome, eta):
        self.nome = nome
        self.eta = eta

    def saluta(self):
        print(f"Ciao, mi chiamo {self.nome} e ho {self.eta} anni.")


#istanza della classe (creazione degli oggetti)
studente = Studente("Luca", 20)
studente.saluta()