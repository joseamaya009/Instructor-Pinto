# Hospital Project

## Overview
The Hospital Project is a Java application designed to manage the assignment of drivers to ambulances, the collection of patients, and the management of deceased individuals. The application allows users to input driver information, assign them to vehicles, and generate reports on their activities.

## Project Structure
```
HospitalProject
├── src
│   ├── Carro.java        # Defines the Carro class representing vehicles.
│   ├── Clinica.java      # Defines the Clinica class representing clinics.
│   ├── Conductor.java     # Defines the Conductor class representing drivers.
│   ├── Funeraria.java     # Defines the Funeraria class representing funeral homes.
│   ├── Main.java          # Entry point of the application with user interaction.
│   ├── Muerto.java        # Defines the Muerto class representing deceased individuals.
│   └── Paciente.java      # Defines the Paciente class representing patients.
└── README.md              # Documentation for the project.
```

## Setup Instructions
1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the `HospitalProject` directory.
4. Compile the Java files using the command:
   ```
   javac src/*.java
   ```
5. Run the application using the command:
   ```
   java -cp src Main
   ```

## Usage
- Upon running the application, you will be prompted to enter the names, surnames, and cell phone numbers of 10 drivers.
- The menu will provide options to:
  - Assign drivers to 10 ambulances.
  - Collect patients, considering the constraints of maximum trips and distances to clinics and funeral homes.
  - Reassign a driver to the funeral car at random.
  - Generate a report detailing driver activities, including how many patients each driver collected and which drivers were unable to collect patients.

## Features
- Input and management of driver, patient, and deceased information.
- Assignment of drivers to ambulances and funeral cars.
- Collection of patients with distance and trip constraints.
- Random reassignment of drivers for funeral services.
- Comprehensive reporting of driver activities.

## Contributing
Contributions to the project are welcome. Please fork the repository and submit a pull request with your changes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.