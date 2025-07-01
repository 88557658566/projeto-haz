document.querySelectorAll('.btn').forEach(btn => {
  btn.addEventListener('click', () => {
    console.log(`Botão clicado: ${btn.textContent.trim()}`);
  });
});