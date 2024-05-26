package ParkingLot;

//Here is a list of all the requirements:

//A parking lot should have a parking lot ID, number of floors, and number of slots on each floor.
//Each slot in the parking lot has a type of vehicle that can park there. Valid types are car, bike, and truck.
//You can include any vehicle type as per your needs. You can also decide which slots should go to each type.
//Here, I am assigning the first slot on each floor to a truck, the next two for bikes, and rest for cars.
//When a vehicle pulls into the parking lot, the application takes the vehicle's type, registration number, and its color.
// You can also have additional details like the vehicle's name, the driver's name, and so on.
//After that, a slot is assigned to the vehicle. The selection strategy could be anything you want.
// Here, we will choose the lowest floor and earliest available slot.
//When a vehicle is assigned a slot, the app should return a ticket.
//The ticket should be a string of the form <parking lot id>_<floor no>_<slot no>.
//For example, the vehicle parked on floor 2, slot 5 would be PR123_2_5.
//To unpark the vehicle, the user should present the valid ticket. After that, the vehicle is removed from the slot.
//The app should be able to display the number of available slots and a list of available and unavailable slots for a specific vehicle type.
public class ParkingLot {


}
