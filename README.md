VirtualPetShelterApp

game loop
ask users for input
write output to consol
calls tick method after each interaction
feed all pets
water all pets
playing with individual pet
allow adoption (remove from shelter)
allow intake of new pet to shelter
VirtualPetShelter Class

return a Collection of all pets in the shelter
return a specific VirtualPet given its name
allow adoption (remove from shelter)
allow intake of new pet to shelter
allow for adoption
feed all pets in shelter
water all pets in shelter
play with an individual pet given it's name
tick that changes the attributes of pets in the shelter
VirtualPet class

variables of pets
name
type
hunger level
thirst level
happiness level
No default constructor
New stuff for Amok
General
Track cages
cleanliness of the cage for organic dogs
cleanliness of the litter box for organic cats
oil/maintence level for robotic animals
All clases
Encapsulate all instance variables
assign appropiate visability modifiers to methods used internally by a class or within a class hierarchy
VirtualPet class and related subclasses/interfaces
This is in addition to the VirtualPetShelter requirements
create a modle that allows for dogs and cats (either can be robotic or organic)
introduce an attribute (instance variable) representing overall health that is updated as a result of other attributes moving in a negative or positive direction, influencing happiness
introduce methods that allow for:
oiling robotic pets
walking organic dogs (this should decrease the likelihood of soiling their cages, and increase hapiness)
do not allow:
feeding/watering of robotic pets
oiling of organic pets
modify the tick method to return a value indicating the amount of waste a pet creates, which should contribute to either (optionally, create accessor methods to retrieve these values instead):
amount of wate in the litter box
amount of waste in an individual dog cage
VirtualPetShelter class
This is in addition to the VirtualPetShelter requirements
introduce methods that allow for:
oiling/maintaining all robotic pets
cleaning dog cages
emptying the litterbox
modify existing methods to only feed/water pets that are not robotic
VirtualPetShelterApp class
This is in addition to the VirtualPetShelter requirements
add options to:
walk all dogs
clean dog cages
clean the shelter litterbox
oil all robotic pets