import {app, db} from "./firebase.js";

let docs = await getDocs(collection(db, "movies"));
docs.forEach((doc) => {
    let row = doc.data();
    
    let image = row['image'];
    let title = row['title'];
    let comment = row['comment'];
    let star = row['star'];

    console.log(row);
});