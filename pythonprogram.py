import numpy as np
li=[1,2,3,4]
print(np.array(li))
import pandas as pd
df=pd.read_csv('Book1.csv')
print(df)
new=df.dropna()
print(new)
df.fillna(130,inplace=True)
print(df)
import pandas as pd

# Read the CSV file
df = pd.read_csv('Book1.csv')

# Select only rows 2 to 6 (index-based)
rows_only = df.iloc[2:4]  # rows 2 to 6 (index 2,3,4,5,6)

print("Selected Rows:")
print(rows_only)
import pandas as pd

# Read the CSV file
df = pd.read_csv('Book1.csv')

# Select only 'Name' and 'Department' columns
columns_only = df[['Name', 'Department']]

print("Selected Columns:")
print(columns_only)
import pandas as pd
md={
    'c':["ai","ml"],
    'd':[2,4]
    }
m=pd.DataFrame(md)
n=pd.Series(md)
print(n)
print(m)

