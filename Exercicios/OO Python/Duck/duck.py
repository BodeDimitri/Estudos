class Duck:
    
    def __init__(self, noise, color, age):
        self.noise = noise
        self.color = color
        self.age = age

    def sound(self):
        print('Duck:'+ self.noise)