function calculateDamage(yourType, opponentType, attack, defense){
  
  var type = {
    fire:0,
    water:1,
    grass:2,
    electric:3
  };

  var effectivenessTable = [[0.5,0.5,2,1],[2,0.5,0.5,0.5],[0.5,2,0.5,1],[1,2,1,0.5]];
  var effectiveness = effectivenessTable[type[yourType]][type[opponentType]];
  return Math.ceil(50 * (attack/defense) * effectiveness);

}
