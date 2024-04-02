<script setup>
import { onMounted, ref } from "vue";
import CartoonCard from "./CartoonCard.vue";

// 초기 데이터 생성
const cartoons = ref([]);

// 마운트 시점에 데이터 호출
onMounted(async () =>{
    // fetch("https://api.sampleapis.com/cartoons/cartoons2D")
    // .then(response => response.json())
    // .then(data => cartoons.value=data)

    const response = fetch("https://api.sampleapis.com/cartoons/cartoons2D")
                    .then(response => response.json());
    cartoons.value = await response;
    
});

</script>

<!-- 메인 template에는 바인딩 구문 사용불가 -->
<template>
    <div class="container">
        <CartoonCard v-for="cartoon in cartoons" :key="cartoon.id" :cartoon/>
    </div>
</template>


<style>
.container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    align-items: center;
    margin: 0 auto;
}
</style>