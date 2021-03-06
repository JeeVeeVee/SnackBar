import sqlite3

conn = sqlite3.connect("SnackBar.db")

def initiate_leiding_table(conn):
    cursor = conn.cursor()
    cursor.execute("""CREATE TABLE leiding (
            first text, 
            last text, 
            schuld float
            )""")

def initiate_snackbar_table(conn):
    cursor = conn.cursor()
    cursor.execute("""CREATE TABLE snackbar (
            naam text
            )""")

def initiate_snack_table(conn):
    cursor = conn.cursor()
    cursor.execute("""CREATE TABLE snack (
            naam text,
            snackbar text,
            prijs float
            )""")

def generate_insert_leiding_statement(leider, connection):
    cursor = connection.cursor()
    statement = "INSERT INTO leiding VALUES ('{}', '{}', {})".format(leider[0], leider[1], leider[2])
    cursor.execute(statement)
    connection.commit()

def fill_leiding_table():
    file = open("src/python_parts/database_setup/leiding.csv", "r")
    for line in file:
        leider = line[:-1].split()
        print(leider)
        generate_insert_leiding_statement(leider, conn)
        
def addbar(bar, connection):
    cursor = connection.cursor()
    statement = "INSERT INTO snackbar VALUES ('{}')".format(bar)
    cursor.execute(statement)
    connection.commit()
    return 0

def add_snack(bar, connection, snack):
    cursor = connection.cursor()
    statement = "INSERT INTO snack VALUES ('{}', '{}', {})".format(snack[0], bar, snack[1])
    print(statement)
    cursor.execute(statement)
    connection.commit()

def fill_test_bar(con):
    file = open("src/python_parts/database_setup/test_snackbars.csv", "r")
    for line in file:
        bar = line[:-1]
        addbar(bar, con)

# important, bar is a string 
def fill_test_snacks_for_njam_njam(conn, bar):
        file = open("src/python_parts/database_setup/njam_njam_snacks.csv", "r")
        for line in file: 
            snack = line[:-1].split("\t")
            add_snack("njam njam", conn, snack)








curs = conn.cursor()
initiate_leiding_table(conn)
fill_leiding_table()

initiate_snack_table(conn)
initiate_snackbar_table(conn)
fill_test_bar(conn)
fill_test_snacks_for_njam_njam(conn, "njam njam")
