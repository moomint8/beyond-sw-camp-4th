<script setup>
  import Header from './components/Header.vue';
  import CartoonContainer from './components/cartoon/CartoonContainer.vue';
</script>

<template>
  <Header></Header>
  <main>
    <CartoonContainer></CartoonContainer>
  </main>
</template>

<style scoped>

main{
  border: 2px solid black;
  padding: 5px;
}
</style>