# Import pandas
import pandas as pd

# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame using that data
dataframe = pd.DataFrame(data)

# Print the DataFrame
print(dataframe)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("sample.csv", index=False)

#to read data from the CSV file
input_data=pd.read_csv("sample.csv")

print(input_data)

print(input_data["Usernames"])

print(input_data["Passwords"])

print(input_data["Usernames"][1])

print(input_data["Passwords"][1])

print(input_data.sort_values("Usernames"))

print(input_data.sort_values("Usernames", ascending=False))