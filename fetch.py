import requests
from bs4 import BeautifulSoup
import re

url = 'https://www.example.com'

response = requests.get(url)

soup = BeautifulSoup(response.text, 'html.parser')

links = soup.find_all('a')

#urls = [link.get('href') for link in links]

urls = [url for url in urls if url and re.match(r'^https?://', url)]

for url in urls:
    print(url)
