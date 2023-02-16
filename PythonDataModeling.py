


Datamodel_lists = {

"UserID":  1,
"Pin":    2, 

}

def DataListing():

    for Datalist, Listing in Datamodel_lists.items():
        print(f"{Listing}x {Datalist}")

        DataListing()

        