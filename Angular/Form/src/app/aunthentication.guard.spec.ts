import { TestBed } from '@angular/core/testing';
import { CanActivateFn } from '@angular/router';

import { aunthenticationGuard } from './aunthentication.guard';

describe('aunthenticationGuard', () => {
  const executeGuard: CanActivateFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => aunthenticationGuard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
