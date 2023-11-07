
// Firebase SDK 라이브러리 가져오기
import { initializeApp } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-app.js";
import { getFirestore } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";
import { collection, addDoc } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";
import { getDocs } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";


// Firebase 구성 정보 설정
const firebaseConfig = {
    apiKey: "AIzaSyD5KFbYNr-_oFOs2G6HkWC39edtQY_VlaQ",
    authDomain: "sparta-b9ff9.firebaseapp.com",
    projectId: "sparta-b9ff9",
    storageBucket: "sparta-b9ff9.appspot.com",
    messagingSenderId: "479727221037",
    appId: "1:479727221037:web:6046e71f3aea5d56907ba4",
    measurementId: "G-CV1HNE7JSJ"
};


// Firebase 인스턴스 초기화
export const app = initializeApp(firebaseConfig);
export const db = getFirestore(app);
