<script setup>
import {defineProps, onMounted} from "vue";
import CartoonDescription from "./CartoonDescription.vue";

const errorImg = "https://img.freepik.com/premium-vector/curious-puppy-dog-life-animal_316839-5024.jpg";
const props  = defineProps({
    cartoon:Object
})

function deleteItem(id) {
    alert("hi" + id)
}
function redirect(event){
    event.target.src = errorImg;
}

</script>
<template>
    <div class="card">
        <div class="head">
            <h3 class="title">{{ cartoon.title }}</h3>
            <button class="delBtn" @click="deleteItem(cartoon.id)">
                <img class="delete" src="https://cdn-icons-png.flaticon.com/512/5610/5610967.png" alt="삭제" />
            </button>
        </div>
        <!-- v-bind:scr 이미지 리소스를 바인딩할 때 사용되며 :src로 축약가능 -->
        <img class="imgCard"
            @error="redirect"
            v-bind:src="cartoon.image"
            v-bind:alt="cartoon.title" />
        <!-- sloat -->
        <CartoonDescription>
            <template #creator>{{ cartoon.creator }}</template>
            <template #year >{{ cartoon.year }}</template>
            <template #genre>{{ cartoon.genre }}</template>
        </CartoonDescription>
    </div>

</template>

<style scoped>
h2 {
    margin: 0;
    padding: 0;
    border: 0;
    outline: 0;
    vertical-align: baseline;
    background: transparent;
}

.card {
    max-width: 20%;
    border: 1px solid black;
    border-radius: 10px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    margin-left: 10px;
    margin-bottom: 10px;
    height: 450px;
    width: 270px;
}

.head {
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 100%;
}

.title {
    margin-left: auto;
    margin-right: auto;
}

.delBtn {
    background-color: white;
    border: 0;
}

.delete {
    width: 20px;
    height: 20px;
}

.imgCard {
    width: 60%;
    height: 70%;
}
</style>